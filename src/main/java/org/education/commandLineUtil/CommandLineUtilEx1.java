package org.education.commandLineUtil;

import org.educationlib.CommandLineUtil;

public class CommandLineUtilEx1 {
    public static void main(String[] args)
    {
        CommandLineUtil.checkForLengthGreater(args, 1, "", -1);
    }
}
