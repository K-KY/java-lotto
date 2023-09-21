````mermaid
graph LR
    시작[Start] --> 금액입력{InputMoney}
    금액입력{InputMoney} --> 검증(ValidateMoney)
    검증(ValidateMoney) -- FALSE --> 예외(Exception)
    예외(Exception) --> 예외출력(ExceptionOutput)
    검증(ValidateMoney) -- TRUE --> 번호생성(Generate)
    번호생성(Generate) --> 생성된_번호_출력(printWinNum)
    번호생성(Generate) --> 당첨번호_입력{InputWinNum}
    당첨번호_입력{InputWinNum} --> 당첨번호_검증(ValidateWinNum)
    당첨번호_검증(ValidateWinNum) -- FALSE --> 예외(Exception)
    당첨번호_검증(ValidateWinNum) -- TRUE --> 비교(Compare)
    비교(Compare) --> 수익률계산(Calculate)
    수익률계산 --> 결과출력(PrintResult)
````