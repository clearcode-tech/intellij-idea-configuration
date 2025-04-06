## Шаблон TenantEvent

### [Порядок импорта и экспорта настроек](https://hr-link.atlassian.net/wiki/spaces/DEVELOPMEN/pages/649855195/File+Templates+Intellij+IDEA)

### В шаблон входит:

1. Event(событие для отправки в kafka).
2. Topic.
3. Publisher.
4. Subscriber.
5. Handler.

### Переменные

1. Handler Name - имя действия в хэнделере, например, SendUserNotificationEvent.
2. Lowercase Handler Name - то же самое, что и выше, но в нижнем регистре, например, sendUserNotificationEvent.
3. Event Description - описание события в предложном падеже, например, "отправке уведомления пользователю".
4. Event Name Without Event On End - имя события без суффикса Event, например, DocumentsUploaded.

### Использование:

Данный шаблон автоматически переносит каждый из создаваемых классов в нужную директорию.

Создавать данный шаблон необходимо через базовую директорию сервиса src/main/java/tech/clearcode/candidate/candidate_id.

1. Создаем шаблон: New -> TenantEvent.
2. Вводим значение переменных шаблона.
3. Нажимаем "ОК".
