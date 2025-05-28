//////// 페이지에 처음 들어왔을 때 
window.addEventListener("load", function () {
  let data = localStorage.getItem("data")
  if (data != null) {
    document.querySelector("#saved > li").innerText = JSON.parse(data)
  } else {
    document.querySelector('#saved > li').innerText = "저장된 내용이 없습니다."
  }
})



// Create 버튼을 클릭했을 때 해당 문자열을 json으로 바꾸고, 
// localStorage에 setItem을 한다.

//////// 등록 #create 

// 1. 등록 버튼 선택(접근)
const createBtn = document.querySelector("#create")
// 2. 등록 버튼에 클릭 이벤트 추가
createBtn.addEventListener("click", function(){
  // 2-a. input 태그  || input 아이디 선택 
  const inputTag = document.querySelector("#input")
  // 2-b. input에서 가져온 value를 json문자열으로 바꾸기
  let jsonData = JSON.stringify(inputTag.value)
  // 2-c. localStorage에 "data" 이름으로 값 추가
  localStorage.setItem("data", jsonData)
  // (중요) 2-d. input태그의 value값 초기화
  inputTag.value = ""
})

// read를 클릭할 때, local Storage에서 getItem을 해서, 
// saved 내 li에 표시한다.
// JSON.parse()를 통해서 json -> text로 바꾼다.

//////// 조회 #read 
// 코드를 작성하세요.
document.querySelector("#read").addEventListener("click", function(){
  const liTag = document.querySelector("#saved > li")
  const jsonData = localStorage.getItem("data")
  if(jsonData != null){
    liTag.innerText = JSON.parse(jsonData)
  }
})

//////// 삭제 #delete 
// 코드를 작성하세요.
document.querySelector("#delete").addEventListener("click", function(){
  localStorage.removeItem("data")
  document.querySelector('#saved > li').innerText = "저장된 내용이 없습니다."
})




