/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.clementlevallois.myfirstapp;

/**
 * GUI builder created Form
 *
 * @author C. Levallois
 */
public class Form1 extends com.codename1.ui.Form {

    public Form1() {
        this(com.codename1.ui.util.Resources.getGlobalResources());
    }
    
    public Form1(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Label gui_Label = new com.codename1.ui.Label();
    private com.codename1.ui.Button gui_Button = new com.codename1.ui.Button();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.LayeredLayout());
        setInlineStylesTheme(resourceObjectInstance);
                setInlineStylesTheme(resourceObjectInstance);
        setTitle("Form1");
        setName("Form1");
        addComponent(gui_Label);
        addComponent(gui_Button);
        gui_Label.setPreferredSizeStr("52.910053mm inherit");
        gui_Label.setText("Label");
                gui_Label.setInlineStylesTheme(resourceObjectInstance);
        gui_Label.setName("Label");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Label.getParent().getLayout()).setInsets(gui_Label, "6.98324% auto auto 34.493042%").setReferenceComponents(gui_Label, "1 -1 -1 -1").setReferencePositions(gui_Label, "1.0 0.0 0.0 0.0");
        gui_Button.setText("Press me!");
                gui_Button.setInlineStylesTheme(resourceObjectInstance);
        gui_Button.setName("Button");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Button.getParent().getLayout()).setInsets(gui_Button, "10.419162% auto auto 37.673958%").setReferenceComponents(gui_Button, "-1 -1 -1 -1").setReferencePositions(gui_Button, "0.0 0.0 0.0 0.0");
        com.codename1.ui.Command cmd_UpDateLabelText = new com.codename1.ui.Command("Press me!") {
                public void actionPerformed(com.codename1.ui.events.ActionEvent ev) {
                        onUpDateLabelTextCommand(ev, this);
                }
        };
        gui_Button.setCommand(cmd_UpDateLabelText);
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
    public void onUpDateLabelTextCommand(com.codename1.ui.events.ActionEvent ev, com.codename1.ui.Command cmd) {
    this.gui_Label.setText("pressed!");
    }

}

