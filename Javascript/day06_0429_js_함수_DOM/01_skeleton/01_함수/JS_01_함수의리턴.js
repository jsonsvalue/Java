// 함수의 리턴

// 함수의 실행 결과로 함수를 반환할 수 있음
// 함수가 특별한 값을 리턴 하지 않은 경우 undefined가 반환됨

/* 자유롭게 코드를 작성해보세요. */
function func1(){
  return function(num1, num2){
    return num1+num2;
  }

}

console.log(func1()(10, 20))