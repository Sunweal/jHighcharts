package com.ttxit.jhighcharts.styles;

import com.ttxit.jhighcharts.intfs.Style;

/**
 * 字体
 * 
 * @author shicheng
 *
 */
public class Font implements Style {
    
    /**
     * 字体样式
     */
    private String fontStyle;
    
    /**
     * 字体异体
     */
    private String fontVariant;
    
    /**
     * 字体粗细
     */
    private String fontWeight;
    
    /**
     * 字体尺寸
     */
    private String fontSize;
    
    /**
     * 字体行高
     */
    private String fontHeight;
    
    /**
     * 字体系列
     */
    private String fontFamily;
    
    /**
     * 定义被标题控件（比如按钮、下拉列表等）使用的字体
     */
    private String caption;
    
    /**
     * 定义被图标标记使用的字体
     */
    private String icon;
    
    /**
     * 定义被下拉列表使用的字体
     */
    private String menu;
    
    /**
     * 定义被对话框使用的字体
     */
    private String messageBox;
    
    /**
     * caption 字体的小型版本
     */
    private String smallCaption;
    
    /**
     * 定义被窗口状态栏使用的字体
     */
    private String statusBar;
    
    public String getFontStyle() {
        return fontStyle;
    }
    
    public void setFontStyle(String fontStyle) {
        this.fontStyle = fontStyle;
    }
    
    public void setFontStyle(Object fontStyle) {
        this.fontStyle = fontStyle.toString();
    }
    
    public String getFontVariant() {
        return fontVariant;
    }
    
    public void setFontVariant(String fontVariant) {
        this.fontVariant = fontVariant;
    }
    
    public void setFontVariant(Object fontVariant) {
        this.fontVariant = fontVariant.toString();
    }
    
    public String getFontWeight() {
        return fontWeight;
    }
    
    public void setFontWeight(String fontWeight) {
        this.fontWeight = fontWeight;
    }
    
    public void setFontWeight(Object fontWeight) {
        this.fontWeight = fontWeight.toString();
    }
    
    public String getFontSize() {
        return fontSize;
    }
    
    public void setFontSize(String fontSize) {
        this.fontSize = fontSize;
    }
    
    public void setFontSize(Object fontSize) {
        this.fontSize = fontSize.toString();
    }
    
    public String getFontHeight() {
        return fontHeight;
    }
    
    public void setFontHeight(String fontHeight) {
        this.fontHeight = fontHeight;
    }
    
    public void setFontHeight(Object fontHeight) {
        this.fontHeight = fontHeight.toString();
    }
    
    public String getFontFamily() {
        return fontFamily;
    }
    
    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }
    
    public void setFontFamily(Object fontFamily) {
        this.fontFamily = fontFamily.toString();
    }
    
    public String getCaption() {
        return caption;
    }
    
    public void setCaption(String caption) {
        this.caption = caption;
    }
    
    public void setCaption(Object caption) {
        this.caption = caption.toString();
    }
    
    public String getIcon() {
        return icon;
    }
    
    public void setIcon(String icon) {
        this.icon = icon;
    }
    
    public void setIcon(Object icon) {
        this.icon = icon.toString();
    }
    
    public String getMenu() {
        return menu;
    }
    
    public void setMenu(String menu) {
        this.menu = menu;
    }
    
    public void setMenu(Object menu) {
        this.menu = menu.toString();
    }
    
    public String getMessageBox() {
        return messageBox;
    }
    
    public void setMessageBox(String messageBox) {
        this.messageBox = messageBox;
    }
    
    public void setMessageBox(Object messageBox) {
        this.messageBox = messageBox.toString();
    }
    
    public String getSmallCaption() {
        return smallCaption;
    }
    
    public void setSmallCaption(Object smallCaption) {
        this.smallCaption = smallCaption.toString();
    }
    
    public void setSmallCaption(String smallCaption) {
        this.smallCaption = smallCaption;
    }
    
    public String getStatusBar() {
        return statusBar;
    }
    
    public void setStatusBar(String statusBar) {
        this.statusBar = statusBar;
    }
    
    public void setStatusBar(Object statusBar) {
        this.statusBar = statusBar.toString();
    }
    
}
