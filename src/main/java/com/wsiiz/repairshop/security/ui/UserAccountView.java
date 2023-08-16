//package com.wsiiz.repairshop.security.ui;
//
//import com.vaadin.flow.component.combobox.ComboBox;
//import com.vaadin.flow.component.datepicker.DatePicker;
//import com.vaadin.flow.component.dependency.Uses;
//import com.vaadin.flow.component.formlayout.FormLayout;
//import com.vaadin.flow.component.html.Div;
//import com.vaadin.flow.component.icon.Icon;
//import com.vaadin.flow.router.PageTitle;
//import com.vaadin.flow.router.Route;
//import com.vaadin.flow.router.RouteAlias;
//import com.wsiiz.repairshop.application.ui.MainLayout;
//import com.wsiiz.repairshop.customerfile.domain.Customer;
//import com.wsiiz.repairshop.foundation.domain.AbstractFactory;
//import com.wsiiz.repairshop.foundation.domain.AbstractService;
//import com.wsiiz.repairshop.foundation.ui.baseview.BaseView;
//import com.wsiiz.repairshop.security.domain.useraccount.*;
//import jakarta.persistence.CascadeType;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.OneToMany;
//
//import javax.swing.*;
//import java.awt.*;
//import java.time.LocalDateTime;
//import java.util.List;
//
//@PageTitle("Użytkownicy")
//@Route(value =  "user-accounts/:id?:/:action?(edit)", layout = MainLayout.class)
//@RouteAlias(value = "",layout =  MainLayout.class)
//@Uses(Icon.class)
//public class UserAccountView extends BaseView<Customer> {
//
//    TextField userName;
//    TextField login;
//    ComboBox<UserType> type;
//    DatePicker registrationTime;
//    DatePicker recentLoginTime;
//    JList<UserRole> roles;
//
//    public UserAccountView(UserAccountFactory factory, UserAccountService service) {
//        super("user-accounts/%s/edit", UserAccount.class, factory, service);
//        createLayout();
//    }
//
//
//    @Override
//    protected void configureGrid() {
//        grid.addColumn("userName").setAutoWidth(true).setHeader(i18n("userName"));
//        grid.addColumn("login").setAutoWidth(true).setHeader(i18n("login"));
//        grid.addColumn("type").setAutoWidth(true).setHeader(i18n("type"));
//        grid.addColumn("registrationTime").setAutoWidth(true).setHeader(i18n("registrationTime"));
//        grid.addColumn("recentLoginTime").setAutoWidth(true).setHeader(i18n("recentLoginTime"));
//        grid.addColumn("roles").setAutoWidth(true).setHeader(i18n("roles"));
//
//
//    }
//
//    @Override
//    protected FormLayout createEditorForm(final Div editorDiv) {
//        return null;
//    }
//}
