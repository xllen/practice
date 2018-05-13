import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.*;

import javax.swing.*;

 public class CheckInfo extends JFrame {

    private JTextField textField;

    public static void main(String args[]) {
        try {
            CheckInfo frame = new CheckInfo();
            frame.setVisible(true);

        } catch (Exception e) {
            e.printStackTrace();

        }

    }

    public CheckInfo() {
        super();
        setBounds(100, 100, 500, 375);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        getContentPane().add(panel, BorderLayout.CENTER);
        //定义姓名文本框
        final JLabel label = new JLabel();
        label.setText("姓名：");
        final GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridx = 0;
        panel.add(label, gridBagConstraints);
        textField = new JTextField();
        textField.setName("姓名");
        textField.setColumns(20);
        final GridBagConstraints gridBagConstraints_5 = new GridBagConstraints();
        gridBagConstraints_5.gridy = 0;
        gridBagConstraints_5.gridx = 1;
        panel.add(textField, gridBagConstraints_5);

        //定义确定按钮，并添加监听器
        final JButton button = new JButton();
        button.setText("确定");
        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
               // 通过Java反射机制获得类中的所有属性
                Field[] fields = CheckInfo.class.getDeclaredFields();
                for (int i = 0; i < fields.length; i++) {
                    Field field = fields[i];
                    if (field.getType().equals(JTextField.class)) { // 只验证JTextField类型的属性
                        field.setAccessible(true); // 默认情况下不允许访问私有属性，如果设为true则允许访问
                        JTextField textField = null;
                        try {
                            textField = (JTextField) field.get(CheckInfo.this); // 获得本类中的对应属性
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                        if (textField.getText().trim().length() == 0) { // 查看该属性是否为空
                            String info = "请填写“" + textField.getName()
                            + "”！";
                            JOptionPane.showMessageDialog(null, info,
                                    "友情提示",
                                    JOptionPane.INFORMATION_MESSAGE);
                            textField.requestFocus(); // 令为空的文本框获得焦点
                            return;

                        }
                    }
                }


            }
        });
        final GridBagConstraints gridBagConstraints_8 = new GridBagConstraints();
        gridBagConstraints_8.gridy = 4;
        gridBagConstraints_8.gridx = 1;
        panel.add(button, gridBagConstraints_8);
    }
}
