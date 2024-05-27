# VK Echo Bot

Тестовое задание. Spring Boot приложение для создания эхо-бота ВКонтакте. Бот отвечает пользователям, повторяя текст их сообщений. 

## Требования

- Java 11 или выше
- Gradle

## Конфигурация

Перед запуском приложения, настройте параметры в файле `src/main/resources/application.properties`:
vk:
  api:
    token: "YOUR_VK_API_TOKEN"  # Токен доступа VK API
  group:
    id: "YOUR_GROUP_ID"          # Идентификатор группы VK
  confirmation:
    code: "YOUR_CONFIRMATION_CODE"  # Код подтверждения для VK
server:
  port: 8080                      # Порт для запуска приложения
