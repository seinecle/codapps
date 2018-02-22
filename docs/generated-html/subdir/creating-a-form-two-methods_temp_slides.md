= CODAPPS: Creating a Form with two different approaches
Clément Levallois <levallois@em-lyon.com>
2018-01-11

last modified: {docdate}

:icons!:
:source-highlighter: rouge
:iconsfont:   font-awesome
:revnumber: 1.0
:example-caption!:


:title-logo-image: EMLyon_logo_corp.png[width="242" align="center"]

[.stretch]
image::EMLyon_logo_corp.png[width="242" align="center"]


==  'Escape' or 'o' to see all sides, F11 for full screen, 's' for speaker notes

==  1. Creating a Form and a Label by writing some code (DYI approach)

==  !
Not sure what a Form is? Have a look at the previous lesson!

==  !
Ok so if we are supposed to create our app by writing some code, where should this code be written?

NetBeans is a software with many functionalities, including text editing: you can write code directly into the files of your app, in NetBeans. These files are visible here:

==  !
[.stretch]
image::The-files-of-your-app-visible-in-NetBeans.png[align="center",title="The files of your app visible in NetBeans"]


==  !
*Double click* on the file `MyApplication.java` to display its content in the right panel in NetBeans:

==  !
[.stretch]
image::Opening-the-content-of-MyApplication.java-for-editing.png[align="center",title="Opening the content of MyApplication.java for editing"]


==  !
When we created the project in the previous lesson, a Form was added to this new app by default, with a Label saying "Hi World" in it.

==  !
How was this Form and this Label added to the app?

Simply with 3 lines of code included in the file `MyApplication.java`:

==  !
IMPORTANT: we will now show some lines of code *but you are not supposed to understand them at this stage*. It is simply to illustrate that Forms can be created with code.

(scroll down a bit in NetBeans, as these lines are in the middle of the file):


==  !
[[anchor-1]]
.MyApplication.java
[source,java]
----
public void start() {
    if(current != null){
        current.show();
        return;
    }
    Form hi = new Form("Hi World", BoxLayout.y()); // <1>
    hi.add(new Label("Hi World")); // <2>
    hi.show(); // <3>
}
----
<1> This line creates the screen with a title "Hi World".
<2> This line adds a Label saying ("Hi World") in the Form!
<3> The Form was created but was invisible. With this line, the Form appears on the screen of the phone. So you see it when the app launches!


==  !
So this is how you add a Form by writing some code in a file. But in this course, *we will first use almost no coding at all*. We will use instead a simpler approach:

==  2. Another possibility: creating a form without coding - with the GUI

==  !
In the previous lesson we had called this method the "Ikea approach": we just assemble pre-existing blocks, without designing the whole furniture ourself.

Let's see how it works:

==  !
[.stretch]
image::Creating-a-Form-with-the-GUI---first-step.png[align="center",title="Creating a Form with the GUI - first step"]


==  !
[.stretch]
image::Creating-a-Form-with-the-GUI---second-step.png[align="center",title="Creating a Form with the GUI - second step"]



==  !
[.stretch]
image::Creating-a-Form-with-the-GUI---third-step.png[align="center",title="Creating a Form with the GUI - third step"]


==  !
*Clicking on 'Finish' did not show you any 'Form', so what happened?* Where do I find my 'Form' and how do I use it?

==  !
A file with the same name as your Form as been created, ending with ".java"

So if you named your Form `Form1`, you should see a new file called `Form1.java`. *Open it in this following manner*:

==  !
[.stretch]
image::Opening-the-Form-we-created-to-work-on-it.png[align="center",title="Opening the Form we created to work on it"]


==  !
The window which opens now is called the *"GUI Builder". This window shows a preview of the `Form` you just created.*

It provides simple tools to add text, picture, buttons... to the `Form`, without coding!

Let's examine the GUI Builder in detail:

==  !
[.stretch]
image::Discovering-the-GUI-Builder.png[align="center",title="Discovering the GUI Builder"]


==  !
[.stretch]
image::Save-before-you-quit!.png[align="center",title="Save before you quit!"]


[[anchor-2]]
==  !
And... that's almost it! Whatever you create with the GUI Builder will be included in your app.

*Except that* if you preview your app (clicking the usual big green arrow icon image:green-arrow.jpg[] in NetBeans) to admire your work, you don't see your screen but another one that says "Hi World". Why?

==  !
Even if you can create a Form with the GUI Builder, so without coding, *you still need a couple of lines of code to trigger the opening of the Form when the app launches*.

Where should these lines of code be written? As we have seen <<anchor-1,just above>>, it happens in the file 'MyApplication.java'. Here is how it looks by default:

==  !
.MyApplication.java
[source,java]
----
public void start() {
    if(current != null){
        current.show();
        return;
    }
    Form hi = new Form("Hi World", BoxLayout.y());
    hi.add(new Label("Hi World"));
    hi.show();
}
----

==  !
As you see, at no point is Form1 (the Form we created with the GUI builder) mentioned. No wonder it is not used in our app!

We just need to replace the Form currently mentioned in the code, by our Form called 'Form1'.

==  !
So, *replace* this 3 lines:

[source,java]
----
Form hi = new Form("Hi World", BoxLayout.y());
hi.add(new Label("Hi World"));
hi.show();
----

==  !
with these 2 lines:

[source,java]
----
Form1 myForm1 = new Form1();
myForm1.show();
----

==  !
Now, launching the app preview will show our Form1! It still empty but it is a good start! 🎉🎉

==  !
[.stretch]
image::Previewing-the-Form-you-created!.png[align="center",title="Previewing the Form you created!"]



==  The end

==  !
Questions? Want to open a discussion on this lesson? Visit the forum https://github.com/seinecle/codapps/issues[here] (need a free Github account).

==  !
Find references for this lesson, and other lessons, https://seinecle.github.io/codapps/[here].

==  !
Licence: Creative Commons, https://creativecommons.org/licenses/by/4.0/legalcode[Attribution 4.0 International] (CC BY 4.0).
You are free to:

- copy and redistribute the material in any medium or format
- Adapt — remix, transform, and build upon the material

=> for any purpose, even commercially.

==  !
image:round_portrait_mini_150.png[align="center", role="right"]
This course is designed by Clement Levallois.

Discover my other courses in data / tech for business: http://www.clementlevallois.net

Or get in touch via Twitter: https://www.twitter.com/seinecle[@seinecle]
pass:[    <!-- Start of StatCounter Code for Default Guide -->
    <script type="text/javascript">
        var sc_project = 11592657;
        var sc_invisible = 1;
        var sc_security = "11592657";
        var scJsHost = (("https:" == document.location.protocol) ?
            "https://secure." : "http://www.");
        document.write("<sc" + "ript type='text/javascript' src='" +
            scJsHost +
            "statcounter.com/counter/counter.js'></" + "script>");
    </script>
    <noscript><div class="statcounter"><a title="site stats"
    href="http://statcounter.com/" target="_blank"><img
    class="statcounter"
    src="//c.statcounter.com/11592657/0/11592657/1/" alt="site
    stats"></a></div></noscript>
    <!-- End of StatCounter Code for Default Guide -->]
