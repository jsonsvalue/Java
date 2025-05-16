// 함수 매개변수

// 함수는 호출 시 매개변수의 영향을 받지 않음
// arguments 라는 함수 내부의 프로퍼티를 이용하여 매개변수의 처리가 가능
// 자바스크립트의 함수는 오버로딩 개념을 지원하지 않음
// 기본 인자 (default arguments)를 사용할 수 있음

// 매개변수가 안 쓰이면 그냥 버려진다. ㅋ
function funcA(num){
  console.log("funcA:", num)
}

funcA();
funcA(10);
funcA(10, 20, 30);


function funcB(){
  console.log(arguments.length)
  for(let i=0; i<arguments.length; i++){
    console.log(arguments[i])
  }

}

funcB(1,2,3,4,5,6)