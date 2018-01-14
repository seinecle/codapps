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
    private com.codename1.ui.Label gui_Label_1 = new com.codename1.ui.Label();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.LayeredLayout());
        setInlineStylesTheme(resourceObjectInstance);
                setInlineStylesTheme(resourceObjectInstance);
        setInlineAllStyles("transparency:0; opacity:169; bgType:image_scaled_fill; bgImage:green_background.jpg;");
        setInlineUnselectedStyles("bgType:image_scaled_fill;");
        setTitle("Form1");
        setName("Form1");
        addComponent(gui_Label_1);
        gui_Label_1.setPreferredSizeStr("20.63492mm 9.259259mm");
        gui_Label_1.setText("");
                gui_Label_1.setInlineStylesTheme(resourceObjectInstance);
        gui_Label_1.setInlineAllStyles("fgColor:0; opacity:245; bgType:image_scaled; bgImage:risoul.jpg;");
        gui_Label_1.setName("Label_1");
        ((com.codename1.ui.layouts.LayeredLayout)gui_Label_1.getParent().getLayout()).setInsets(gui_Label_1, "19.401197% 41.94831% auto auto").setReferenceComponents(gui_Label_1, "-1 -1 -1 -1").setReferencePositions(gui_Label_1, "0.0 0.0 0.0 0.0");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}
