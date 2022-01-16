# Автоматизация тестирования официального сайта ERG.


<h1 align="center">
  <br>
  <a href="https://erg.kz/ru"><img src="img/ERG.png" alt="ERG" width="200"></a>
</h1>

## Расположение
* Репозиторий в GithUb <a href="https://github.com/ECLIPSE170790/safron_erg/"><img src="img\GitHub.png" alt="GitHub" width="50"></a>
* Сборка в Jenkins <a href="https://jenkins.autotests.cloud/job/08_eclipse170790_safron_erg/"><img src="img\Jenkins.jpg" alt="Jenkins" width="50"></a>

## Используемые инструменты

| IntelliJ IDEA | Java | Gradle | JUnit | Selenide | Selenoid | Allure Report | Telegram |
|:----------:|:------:|:------:|:--------:|:--------:|:-------------:|:---------:|:--------:|
| <img src="img/IDEA.png" width="50" height="50"> | <img src="img/Java.png" width="40" height="50"> | <img src="img/Gradle.png" width="50" height="50"> | <img src="img/JUnit.svg" width="50" height="50"> | <img src="img/Selenide.svg" width="50" height="50"> | <img src="img/Selenoid.png" width="50" height="50"> | <img src="img/Allure.png" width="50" height="50"> | <img src="img/Telegram.svg" width="50" height="50"> |

## Используемые параметры по умолчанию
* Адрес страницы - https://www.erg.kz/ru
* Браузер - Chrome

## Отчётность можно посмотреть в "Allure Report"

<img src="img/AllureResult.JPG" width="720" height="1280">

## Результаты запуска автотестов приходят в "Телеграм"

<img src="img/TelegramResult.JPG" width="500" height="500">

## Список автотестов
* Проверка наличия слова "Главная" на главной странице.
* Проверка отправки кода подтверждения на мобильный телефон.
* Проверка работы поиска со словом "BTS".
* Проверка наличия города Экибастуз на карте площадок.
* Проверка наличия "Портала закупок" после перехода в раздел "Закупки".