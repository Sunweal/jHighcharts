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
    
    public String getFontVariant() {
        return fontVariant;
    }
    
    public void setFontVariant(String fontVariant) {
        this.fontVariant = fontVariant;
    }
    
    public String getFontWeight() {
        return fontWeight;
    }
    
    public void setFontWeight(String fontWeight) {
        this.fontWeight = fontWeight;
    }
    
    public String getFontSize() {
        return fontSize;
    }
    
    public void setFontSize(String fontSize) {
        this.fontSize = fontSize;
    }
    
    public String getFontHeight() {
        return fontHeight;
    }
    
    public void setFontHeight(String fontHeight) {
        this.fontHeight = fontHeight;
    }
    
    public String getFontFamily() {
        return fontFamily;
    }
    
    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }
    
    public String getCaption() {
        return caption;
    }
    
    public void setCaption(String caption) {
        this.caption = caption;
    }
    
    public String getIcon() {
        return icon;
    }
    
    public void setIcon(String icon) {
        this.icon = icon;
    }
    
    public String getMenu() {
        return menu;
    }
    
    public void setMenu(String menu) {
        this.menu = menu;
    }
    
    public String getMessageBox() {
        return messageBox;
    }
    
    public void setMessageBox(String messageBox) {
        this.messageBox = messageBox;
    }
    
    public String getSmallCaption() {
        return smallCaption;
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
    
}
