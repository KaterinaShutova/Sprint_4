# запуск с Firefox

`mvn -Dbrowser=firefox test`

# запуск с Chrome

`mvn test`

# запуск конкретного теста
для теста вопросов
`mvn -Dtest=QuestionTest test` - Chrome
`mvn -Dtest=QuestionTest -Dbrowser=firefox test` - Firefox

для теста аренды черного скутера на 3 дня
`mvn -Dtest=OrderBlackScooterFor3days test` - Chrome
`mvn -Dtest=OrderBlackScooterFor3days -Dbrowser=firefox test` - Firefox

для теста аренды серого скутера на 5 дней
`mvn -Dtest=OrderGreyScooterFor5days test` - Chrome
`mvn -Dtest=OrderGreyScooterFor5days -Dbrowser=firefox test` - Firefox
# Sprint_4
