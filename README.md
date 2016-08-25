# Android Syntax Highlight Library

###Основан на коде ShaderEditor от Markus Fisch

В самом редакторе (SyntaxHighlightEditor.java) можно настроить размер текста, добавление номера строк и т.д.

SHOW_LINE_NUMBERS - Включение/выключение подсчета строк (true/false)

SYNTAX_HIGHLIGHTING - Включение/выключение подсветки (true/false)

TEXT_SIZE - Размер текста

WORDWRAP - При включение добавляет горизонтальный скроллинг (true/false) (Вообще Word Wrap должен наоборот убирать горизонтальный скроллинг, но тут уже моя ошибка, можете сами исправить в коде)

FLING_TO_SCROLL - Возможность скроллинга быстрыми/резкими движениями (Потестируете - поймете) (true/false)

![SyntaxHighlightEditor] (https://raw.githubusercontent.com/Light-Team/Android-SyntaxHighlightEditor/master/screenshot.png)

###Touch Zoom

Для включения пропишите setZoomable(true/false); в MainActivity.java (В будущем придется многое подправить, так-же есть один баг, увеличение текста работает только если в редакторе написано много кода, если мало - будет идти стандартное выделение, функция работает криво ибо сам Touch Zoom релиазован в Activity а не в кастомном виджете, опять-же - исправлю когда будет время).

![SyntaxHighlightEditor] (https://raw.githubusercontent.com/Light-Team/Android-Syntax-Highlight-Library/master/tz_screenshot1.png)

![SyntaxHighlightEditor] (https://raw.githubusercontent.com/Light-Team/Android-Syntax-Highlight-Library/master/tz_screenshot2.png)

###Оптимизация

Да, она убогая, очень убогая, лагает при тексте в 800+ строк, но над оптимизацией будем работать позже, есть очень много других проектов которые на данный момент хочется реализовать, но обязательно когда-нибудь мне придется ее доработать. Надеюсь у меня дойдут до нее руки в будущем...
