INSERT INTO email_template (id, type, subject, body)
VALUES
    (
        '${Email_template_ID}',
        '$Notification_Type',
        '$Subject',
        E'<html style="margin: 0; padding: 0">\n' ||
        E'<head><meta charset="utf-8"></head>\n' ||
        E'<body style="margin: 0; padding: 0; color: #2d2d2d; font-family: Verdana, sans-serif; font-size: 12px; line-height: 24px;">\n' ||
        E'<div>\n' ||
        E'<p>Добрый день!</p>\n' ||
        E'<p>$Email_Message_first_line</p>' ||
        E'<p>$Email_Message_second_line по <a href="{{{url}}}">ссылке</a>.</p>\n' ||
        E'<p>\n' ||
        E'Появились вопросы? Напишите в службу заботы о клиентах Start-Link:<br><br>\n' ||
        E'Почта: <a href="mailto:{{#getContactEmail}}{{/getContactEmail}}">{{#getContactEmail}}{{/getContactEmail}}</a><br>\n' ||
        E'Telegram: <a href="https://t.me/{{#getContactTelegram}}{{/getContactTelegram}}">{{#getContactTelegram}}{{/getContactTelegram}}</a><br>\n' ||
        E'{{\#if configuration.contactPhoneNumber}}\n' ||
        E'Телефон: <a href="tel:{{#getContactPhoneNumber}}{{/getContactPhoneNumber}}">{{#getContactPhoneNumber}}{{/getContactPhoneNumber}}</a>\n' ||
        E'{{/if}}'
        E'</p>\n' ||
        E'</div>\n' ||
        E'</body>\n' ||
        E'</html>\n'
    );

INSERT INTO sms_template (id, type, text)
VALUES
    (
        '${SMS_template_ID}',
        '$Notification_Type',
        '$Sms_message: {{{url}}}'
    );

INSERT INTO whats_app_template (id, type, text)
VALUES
    (
        '${Whatsapp_template_ID}',
        '$Notification_Type',
        '$Whatsapp_message: {{{url}}}'
    );