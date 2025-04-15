package battleSSAFY;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Main {
	// 닉네임 설정
    private static String NICKNAME = "서울 9반_이재석";

    // 게임 데이터 저장 변수
    private static String[][] mapData;
    private static Map<String, String[]> allies = new HashMap<>();
    private static Map<String, String[]> enemies = new HashMap<>();
    private static String[] codes;

    public static void main(String[] args) {
        Bridge bridge = new Bridge();
        String gameData = bridge.init(NICKNAME);  // 연결 및 게임 시작

        // 게임 루프
        // while 반복문: 배틀싸피 메인 프로그램과 클라이언트가 데이터를 계속해서 주고받는 부분
        while (gameData.length() > 0) {
            // 자기 차례가 돼서 게임 정보를 입력 받는다.
        	System.out.println("----입력 데이터----");
            System.out.println(gameData);
            System.out.println("-----------------");

            parseData(gameData);  // 데이터 파싱

            // 파싱 데이터 확인 (출력)
            printMap();
            printAllies();
            printEnemies();
            printCodes();

            // ======= 행동 결정 알고리즘 (추후 개발) =======
            String output = decideAction();

            // ======= 제출 =======
            gameData = bridge.submit(output);
        }

        // 연결 종료
        bridge.close();
    }

    // 초기 입력 데이터 값을 입력 받는다. 
    static void parseData(String gameData) {
        // Enter키를 기준으로 gameData를 분리한다.
    	String[] rows = gameData.split("\n");
        int rowIndex = 0;

        String[] header = rows[rowIndex++].split(" ");
        int mapHeight = Integer.parseInt(header[0]);
        int mapWidth = Integer.parseInt(header[1]);
        
        int numOfAllies = Integer.parseInt(header[2]);
        int numOfEnemies = Integer.parseInt(header[3]);
        int numOfCodes = Integer.parseInt(header[4]);

        // 맵 데이터
        // 각 줄의 맵 정보를, mapData행으로 받는다.
        // 입력으로 받은 데이터를, mapData에 받는다
        mapData = new String[mapHeight][mapWidth];
        for (int i = 0; i < mapHeight; i++) {
            mapData[i] = rows[rowIndex++].split(" ");
            // System.out.println("Print Row Index");
            // System.out.println(rows[rowIndex]);
            
        }

        // 아군 데이터
        // 아군 데이터를 Key, Value 값으로 필요한 데이터를 담는다.
        // A: 본인 체력, 방향, 일반 포탄 수, 메가 포탄 수
        allies.clear();
        for (int i = 0; i < numOfAllies; i++) {
            
        	String[] allyData = rows[rowIndex++].split(" ");
            allies.put(allyData[0], Arrays.copyOfRange(allyData, 1, allyData.length));
            
            
//            for (String key : allies.keySet()) {
//                System.out.println("아군 Key: " + key + ", Value: " + Arrays.toString(allies.get(key)));
//            }
        }

        // 적군 데이터
        enemies.clear();
        for (int i = 0; i < numOfEnemies; i++) {
            String[] enemyData = rows[rowIndex++].split(" ");
            enemies.put(enemyData[0], Arrays.copyOfRange(enemyData, 1, enemyData.length));
            //System.out.println(enemies);
        }

        // 암호문 데이터
        codes = new String[numOfCodes];
        for (int i = 0; i < numOfCodes; i++) {
            codes[i] = rows[rowIndex++];
        }
    }

    // 출력 함수들
    static void printMap() {
        System.out.printf("\n[맵 정보] (%d x %d)\n", mapData.length, mapData[0].length);
        for (String[] row : mapData) {
            for (String cell : row) {
                System.out.printf("%s ", cell);
            }
            System.out.println();
        }
    }

    static void printAllies() {
        System.out.printf("\n[아군 정보] (아군 수: %d)\n", allies.size());
        for (String key : allies.keySet()) {
            System.out.println(key + " " + Arrays.toString(allies.get(key)));
        }
    }

    static void printEnemies() {
        System.out.printf("\n[적군 정보] (적군 수: %d)\n", enemies.size());
        for (String key : enemies.keySet()) {
            System.out.println(key + " " + Arrays.toString(enemies.get(key)));
        }
    }

    static void printCodes() {
        System.out.printf("\n[암호문 정보] (암호문 수: %d)\n", codes.length);
        for (String code : codes) {
            System.out.println(code);
        }
    }

    // 행동 결정 함수를 적는다.
    static String decideAction() {
    	int row = mapData.length;
    	int col = mapData[0].length;
    	
    	boolean[][] visited = new boolean[row][col];
    	
    	// BFS를 통해서, 포탑으로 가는 최단 경로를 찾는다.
    	int[] enemy = new int[2];
    	List<int[]> path = new ArrayList<>();
    	for (int i=0; i < row; i++) {
    		for(int j=0; j<col ; j++) {
    			if(mapData[i][j].equals("A")) {
    				path = bfs(mapData, visited, i, j);
    			}
    			
    			if(mapData[i][j].equals("X")) {
    				enemy[0] = i;
    				enemy[1] = j;
    			}
    		}
    		
    	}
    	
    	for(int[] xy: path) {
			System.out.println(Arrays.toString(xy));
		};
		
		String command = giveAction(path, enemy);
    	
    	
    	// 좌표나 포탑 위치에 따른 행동을 반환한다.
        return command;
    }
    
    // bfs를 통해서 최단 경로를 찾는다.
    static List<int[]> bfs(String[][] mapData, boolean[][]visited, int x, int y) {
    	int row = mapData.length;
    	int col = mapData[0].length;
    	
    	Queue<int[]> q = new LinkedList<>();
    	q.add(new int[] {x, y});
    	visited[x][y] = true;
    	
    	// 원하는 목적지로 가는 최단 거리를 찾는 배열을 저장한다.
    	int[][] dist = new int[row][col];
    	dist[x][y] = 0;
    	
    	// 경로 추적을 위해서, 이전 좌표를 저장하는 배열을 만든다.
    	// nx, ny 이전 경로를 추적하기 위해서 [nx][ny][0] = x 좌표, [nx][ny][1] = y 좌표
    	int[][][] prev = new int[row][col][2];
    	
    	int[] dx = {-1,1,0,0};
    	int[] dy = {0,0,-1,1};
    	
    	while(!q.isEmpty()) {
    		int[] curr = q.poll();
    		int currX = curr[0];
    		int currY = curr[1];
    		
    		// System.out.println(Arrays.toString(curr));
    		
    		// bfs를 통해서 최단 거리를 갈 수 있는 좌표를 찾아본다.
    		for(int k =0; k<4; k++) {
    			int nx = currX + dx[k];
    			int ny = currY + dy[k];
    			
    			if(nx < 0 || nx >= row || ny < 0 || ny >= col)
    				continue;
    			
    			// 이동하려는 좌표가 물이거나, 돌일 경우에는 갈 수 없다.
    			if(mapData[nx][ny].equals("W")  || mapData[nx][ny].equals("R"))
    				continue;
    			
    			// 모든 조건을 다 통과했다면 Queue에 집어넣고, 해당 좌표로 이동하게 만든다.
    			if(!visited[nx][ny]) {
    				q.add(new int[] {nx, ny});
    				visited[nx][ny]= true;
    				
    				dist[nx][ny] = dist[currX][currY] + 1;
    				
    				// 이전 경로를 저장하기 위해서, prev 배열에 넣는다.
    				prev[nx][ny][0] = currX;
    				prev[nx][ny][1] = currY;
    				
    				// 최종 목적지를 도착하면, 이때까지 지나간 경로를 반환한다.
    				if( mapData[nx][ny].equals("X") ) {
    					System.out.println("포탑까지의 최단 거리 " + dist[nx][ny]);
    					
    					// 목적지에서부터 이전 좌표를 순회하면서, 시작 좌표까지의 경로를 찾는다.
    					List<int[]> path = new ArrayList<>();
    					int pathX = nx;
    					int pathY = ny;
    					
    					// 시작점을 찾을 때까지 이전 경로를 되돌아간다.
    					while( !(pathX == x && pathY == y)) {
    						// 현재 좌표를 path에 넣는다.
    						path.add(new int[] {pathX, pathY});
    						
    						// 현재 좌표의 이전 좌표를 prevX, prevY에 집어 넣는다.
    						int prevX = prev[pathX][pathY][0];
    						int prevY = prev[pathX][pathY][1];
    						
    						// 이전 좌표를 현재 좌표로 넣는다.
    						pathX = prevX;
    						pathY = prevY;
    					}
    					path.add(new int[] {x, y});
    					
    					Collections.reverse(path);

    					
    					return path;
    				}
    			}
    			
    		}
    		
    		
    	}
    	
    	return new ArrayList<>();
    	
    }
    
    // 주어진 좌표값에 의해서, 내가 움직여야 하는 방향과 행해야 하는 행동을 출력하도록 만든다.
    static String giveAction(List<int[]> path, int[]enemy) {
    	
    	int currX = path.get(0)[0];
    	int currY = path.get(0)[1];
    	
    	int nextX = path.get(1)[0];
    	int nextY = path.get(1)[1];
    	
    	int eneX = enemy[0];
    	int eneY = enemy[1];
    	
    	// 현재 좌표
    	System.out.printf("현재 좌표 %d %d \n", currX, currY);
    	System.out.printf("적 포탑 좌표 %d %d \n", eneX, eneY);
    	
    	String command = "";
    	// 어차피 대각선 움직임은 없기 떄문에, 위, 아래, 왼쪽, 오른쪽으로 따져도 된다.
    	if(currX > nextX) {
    		command =  "U A";
    	}else if(currX < nextX) {
    		command = "D A";
    	}else if (currY < nextY) {
    		command = "R A";
    	}else if(currY > nextY) {
    		command = "L A";
    	}
    	
    	// 현재 위치가 적 포탑과 한칸 거리라면, 포탑을 쏜다.
    	if(Math.abs(currX-eneX) + Math.abs(currY-eneY) == 1) {
    		if(currX > nextX) {
        		command =  "U F";
        	}else if(currX < nextX) {
        		command = "D F";
        	}else if (currY < nextY) {
        		command = "R F";
        	}else if(currY > nextY) {
        		command = "L F";
        	}
    	}
    	
    	return command;
    }
    
    
}
