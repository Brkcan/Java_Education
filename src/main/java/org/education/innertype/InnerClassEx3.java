package org.education.innertype;

import org.education.console.Console;

public class InnerClassEx3 {
    public static void main(String[] args)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder();
        builder.setText("Burak").setTitle("Can").setIcon(new Icon("icon")).builder().show();
    }
}

class Icon {
    public String filename;

    public Icon(String filename)
    {
        this.filename = filename;
    }
}

class AlertDialog {
    private String m_title;
    private String m_text;
    private Icon m_icon;
    private String m_positiveButtonText;
    private String m_negativeButtonText;

    private AlertDialog()
    {
        m_title = "";
        m_text = "";
        m_icon = null;
        m_positiveButtonText = "YES";
        m_negativeButtonText = "NO";
    }

    public void show()
    {
        Console.write(m_text + " ");
        Console.write(m_title + " ");
        Console.write(m_icon.filename + " ");
    }

    public static class Builder {
     private final AlertDialog alertDialog = new AlertDialog();

     public Builder setTitle(String title)
     {
         alertDialog.m_title = title;

         return this;
     }

     public Builder setText(String text)
     {
         alertDialog.m_text = text;

         return this;
     }

     public Builder setIcon(Icon icon)
     {
         alertDialog.m_icon = icon;

         return this;
     }

     public AlertDialog builder()
     {
         return alertDialog;
     }

    }
}
