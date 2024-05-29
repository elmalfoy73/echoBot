# VK Echo Bot

Тестовое задание. Spring Boot приложение для создания эхо-бота ВКонтакте. Бот отвечает пользователям, повторяя текст их сообщений.

## Процесс подключения бота к группе ВК

https://dev.vk.com/ru/api/bots/getting-started

## Требования

- Java 11 или выше
- Gradle

## Конфигурация

Перед запуском приложения, настройте параметры в файле `src/main/resources/application.properties`: 
vk.api.token= # Токен доступа VK API  
vk.group.id= # Идентификатор группы VK  
vk.confirmation.code= # Код подтверждения для VK  
server.port= # Порт для запуска приложения

## Пример работы

<img width="213" alt="Screenshot 2024-05-29 at 2 27 53 PM" src="https://github.com/elmalfoy73/echoBot/assets/40549284/afb6fe8b-ae1d-4495-8851-a95bde4e7dac">
