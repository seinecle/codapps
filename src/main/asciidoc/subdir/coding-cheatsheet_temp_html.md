= CODAPPS: Coding Cheatsheet
Clément Levallois <levallois@em-lyon.com>
last modified: {docdate}
:icons: font
:iconsfont: font-awesome
:source-highlighter: rouge
:revnumber: 1.0
:docinfo: shared
:example-caption!:
:sourcedir: ../../../../main/java


:title-logo-image: EMLyon_logo_corp.png[width="242" align="center"]

image::EMLyon_logo_corp.png[width="242" align="center"]
{nbsp} +



//ST: 'Escape' or 'o' to see all sides, F11 for full screen, 's' for speaker notes

== 1. Variables and objects

General rules:

- The type of the variable (String, Long, Boolean...) start [underline]#with# a capital letter.
- variable names start [underline]#without# a capital letter.

==== *String* variables store *text*

[[string]]
.Creating a String variable and giving it a value
[source,java]
----
String title = "Welcome to my app"; //<1>
----
<1> Don't forget the double quotes `" "`!

==== *Integer* variables store *round numbers*

[[integer]]
.Creating an Integer variable and giving it a value
[source,java]
----
Integer classSize = 32;
int anotherClassSize = 25; // <1>
----
<1> `int` is like `Integer`. It takes less memory but is sometimes less convenient to use.
Also, note: [underline]#no# double quote!! Double quotes are just for `String`.

==== *Float* and *Double* variables store *decimals*

__ *Double* is like *Float* but can store *decimals with a lot more precision* __

[[Float-and-Double]]
.Creating Float and Double variables
[source,java]
----
Float pi = 3.14f; //<1>
Double piVeryPrecise = 3.141592653589793238462643383279502884197169d; // <2>
----
<1> Don't forget the `f` letter at the end of your number. `float` or `Float` can be used, `float` takes less memory than `Float`.
<2> Don't forget the `d` letter at the end of your number. `double` or `Double` can be used, `double` takes less memory than `Double`.

==== *Long* stores *big round numbers*

__ *Long* is like *Integer* but can store *bigger numbers* __

[[Long]]
.Creating a Long variable
[source,java]
----
Long millisecondsSinceLastMonth = 364434030430414l; //<1>
----
<1> Don't forget the `l` letter at the end of your number. `long` or `Long` can be used, `long` takes less memory than Long but can be inconvenient to use.

==== *Boolean* stores *true / false values*

__ This seems not very useful but actually we use it quite often __

[[Boolean]]
.Creating a Boolean variable
[source,java]
----
Boolean hasAStudentCard = true; //<1>
----
<1> A classic mistake is to write "true" (with double quotes, which is incorrect). Boolean values are `true` or `false` [underline]#without double quotes " "#.
`boolean` can be used instead of `Boolean`: less memory but also less convenient to use in some cases.

==== `Objects`: to create and store a variety of things

__ A variety of objects exist - use them to create and store things __

[[object]]
.Creating an Object storing a Date
[source,java]
----
Date dateStartOfTheGame;  //<1>
dateStartOfTheGame = new Date(); //<2>
Date dateEndOfTheGame = new Date();  //<3>

----
<1> An object `dateStartOfTheGame` of type `Date` is [underline]#declared#. It is `null` at the moment.
<2> `dateStartOfTheGame` is [underline]#instantiated#: an instance of it is created.
<3> Shortcut: a variable can be [underline]#declared# and [underline]#instantiated# in one line of code.
pass:[    <!-- Start of StatCounter Code for Default Guide -->
    <script type="text/javascript">
        var sc_project = 11592657;
        var sc_invisible = 1;
        var sc_security = "5154b75d";
        var scJsHost = (("https:" == document.location.protocol) ?
            "https://secure." : "http://www.");
        document.write("<sc" + "ript type='text/javascript' src='" +
            scJsHost +
            "statcounter.com/counter/counter.js'></" + "script>");
    </script>
    <noscript><div class="statcounter"><a title="site stats"
    href="http://statcounter.com/" target="_blank"><img
    class="statcounter"
    src="//c.statcounter.com/11592657/0/5154b75d/1/" alt="site
    stats"></a></div></noscript>
    <!-- End of StatCounter Code for Default Guide -->]
