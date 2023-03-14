package com.javarush.task.task18.task1814;

import java.io.*;

/* 
UnsupportedFileName txt
*/

public class TxtInputStream extends FileInputStream {
    public static String path = ".txt";

    TxtInputStream txtInputStream;

    public TxtInputStream(FileDescriptor fdObj) {
        super(fdObj);
    }

    @Override
    public int read() throws IOException {
        return super.read();
    }

    @Override
    public int read(byte[] b) throws IOException {
        return super.read(b);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        return super.read(b, off, len);
    }

    @Override
    public void close() throws IOException {
        super.close();
    }


    public TxtInputStream(String fileName) throws IOException, UnsupportedFileNameException {
        super(fileName);
        if (!fileName.endsWith(".txt")) {
            super.close();
            throw new UnsupportedFileNameException();
        }


    }

    public static void main(String[] args) {
    }
}

