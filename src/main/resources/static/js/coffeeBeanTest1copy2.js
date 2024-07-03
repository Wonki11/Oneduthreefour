let answer = {}; //빈 장바구니같은 배열

//optionSelect 기능만들기
function optionSelect(selectedOption) {
  // 각 질문에 대한 답을 저장
  let presentQuestion = Object.keys(answer).length + 1; //현재까지 사용자가 답한 질문의 수를 나타낸 것
  answer["problem" + presentQuestion] = selectedOption; //answer이라는 배열에 내가 선택한 problem와 problem에 대한 옵션을 저장
  //  {'problem1' : 'E'}

  //nextQuestion 보여주기
  let nextQuestion = presentQuestion + 1;

  let presentQuestiondiv = document.getElementById("problem" + presentQuestion);
  let nextQuestiondiv = document.getElementById("problem" + nextQuestion);

  //만약에 nextQuestion으로 왔으면 presentQuestion은 숨기고 nextQuestion을 보여주겠다.
  if (nextQuestiondiv) {
    presentQuestiondiv.style.display = "none"; // 현재 질문 숨기기
    nextQuestiondiv.style.display = "block"; // 다음 질문 보여주기
  } else {
    resultFind();
  }
}

function resultFind() {
	let resultConfigure = "";
	let resultBinary = { A: 0, B: 0, C: 0, D: 0, E: 0, F: 0, G: 0, H: 0 };
	
	for (let problem in answer) {
	  resultBinary[answer[problem]]++;
	}
	
	if (resultBinary["A"] > resultBinary["B"]) {
	  resultConfigure += "0";
	} else {
	  resultConfigure += "1";
	}
	
	if (resultBinary["C"] > resultBinary["D"]) {
	  resultConfigure += "0";
	} else {
	  resultConfigure += "1";
	}
	
	if (resultBinary["E"] > resultBinary["F"]) {
	  resultConfigure += "0";
	} else {
	  resultConfigure += "1";
	}
	
	if (resultBinary["G"] > resultBinary["H"]) {
	  resultConfigure += "0";
	} else {
	  resultConfigure += "1";
	}
		
	let resultDecimal = parseInt(resultConfigure, 2);
	
	document.getElementById("resultConfigure").innerText = resultDecimal;
	document.getElementById("resultConfigure").style.display = "block";
	
	let coffeeBeanId = resultDecimal + 1;
	
	let moveButton = document.querySelector(".option");
	moveButton.setAttribute("onclick", `moveToDetailPage(${coffeeBeanId})`);
	
	// 이동할 URL 설정
    let url = `/coffeeBeanDetail/${coffeeBeanId}`;

    // 현재 창에서 해당 URL로 이동
    window.location.href = url;
}


/*
추후에 이진수 값을 십진수로 변환해서 16개의 원두 중 하나로 매치할 예정
*/

/*
function 이전버튼() {
  let 현재질문 = Object.keys(정답).length + 1;

  let 이전질문 = 현재질문 - 1;

  let 현재질문div = document.getElementById("문제" + 현재질문);
  let 이전질문div = document.getElementById("문제" + 이전질문);

    if (이전질문div) {
      현재질문div.style.display = "none"; // 현재 질문 숨기기
      이전질문div.style.display = "block"; // 이전 질문 보여주기
    }
}

function 다음버튼() {
  let 현재질문 = Object.keys(정답).length + 1;

  let 다음질문 = 현재질문 + 1;

  let 현재질문div = document.getElementById("문제" + 현재질문);
  let 다음질문div = document.getElementById("문제" + 다음질문);

  if (다음질문div) {
    현재질문div.style.display = "none"; // 현재 질문 숨기기
    다음질문div.style.display = "block"; // 다음 질문 보여주기
  }
}
*/