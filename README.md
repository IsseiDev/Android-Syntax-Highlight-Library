# Android SyntaxHighlight Editor

###Based on ShaderEditor by Markus Fisch

В самом редакторе (SyntaxHighlightEditor.java) можно настроить размер текста, добавление номера строк и т.д.

SHOW_LINE_NUMBERS - Включение/выключение подсчета строк (true/false)

SYNTAX_HIGHLIGHTING - Включение/выключение подсветки (true/false)

TEXT_SIZE - Размер текста

WORDWRAP - При включение добавляет горизонтальный скроллинг (true/false)

FLING_TO_SCROLL - Возможность скроллинга быстрыми/резкими движениями (Потестируете - поймете) (true/false)

![SyntaxHighlightEditor] (https://raw.githubusercontent.com/Light-Team/Android-SyntaxHighlightEditor/master/screenshot.png)

###Touch Zoom

Для включения пропишите setZoomable(true/false); в MainActivity.java (Только есть один баг, увеличение текста работает только если в редакторе написано много кода, если мало - будет идти стандартное выделение)

![SyntaxHighlightEditor] (https://raw.githubusercontent.com/Light-Team/Android-SyntaxHighlightEditor/master/tz_screenshot1.png)

![SyntaxHighlightEditor] (https://raw.githubusercontent.com/Light-Team/Android-SyntaxHighlightEditor/master/tz_screenshot2.png)
