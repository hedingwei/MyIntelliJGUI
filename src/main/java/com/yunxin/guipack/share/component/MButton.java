package com.yunxin.guipack.share.component;

import javax.swing.*;

public class MButton extends MIconComponentBase<JButton> {

    @Override
    protected Class<? extends JComponent> provideComponent() {
        return JButton.class;
    }
}
