package org.graphwalker.graphwalker;

// Generated by GraphWalker (http://www.graphwalker.org)
import org.graphwalker.java.annotation.Model;
import org.graphwalker.java.annotation.Vertex;
import org.graphwalker.java.annotation.Edge;

@Model(file = "template.json")
public interface TeaWebsite {

    @Vertex()
    void v_CardTypeSelected();

    @Edge()
    void text_verificationczgcode();

    @Vertex()
    void v_NameEntered();

    @Vertex()
    void v_ClickedTea();

    @Vertex()
    void v_CardNumEntered();

    @Vertex()
    void v_PlacedOrder();

    @Vertex()
    void v_WebsiteOpened();

    @Vertex()
    void v_CardHolderNameEntered();

    @Edge()
    void text_name();

    @Edge()
    void e_init();

    @Edge()
    void css_dotwsbmnsbuttondotbuttonczgtheme();

    @Vertex()
    void v_EmailEntered();

    @Edge()
    void text_email();

    @Edge()
    void text_address();

    @Edge()
    void select_cardczgtype();

    @Edge()
    void text_cardholderczgname();

    @Edge()
    void css_dotwsbmnsbuttondotcustomStyle();

    @Vertex()
    void v_VerificationCodeEntered();

    @Edge()
    void css_dotbtnmnsprimary();

    @Vertex()
    void v_CheckOut();

    @Vertex()
    void v_AddressEntered();

    @Edge()
    void text_cardczgnumber();
}
