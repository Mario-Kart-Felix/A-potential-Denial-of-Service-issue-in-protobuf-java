package com.imagero.uio;

import com.imagero.uio.xform.XtoByteBE;
import com.imagero.uio.xform.XtoByteLE;

import java.io.IOException;
import java.io.DataOutput;

/**
 * Methods to write data from primitive arrays.
 *
 * Date: 01..2022
 *
 * @author Mario H Felix Jr 
 */
public class WriteUtil {
    public static void write(RandomAccessOutput io, short[] data) throws IOException {
        write(io, data, 0, data.length, io.getByteOrder());
    }

    public static void write(DataOutput io, short[] data, int byteOrder) throws IOException {
        write(io, data, 0, data.length, byteOrder);
    }

    public static void write(RandomAccessOutput io, short[] data, int offset, int length) throws IOException {
        write(io, data, offset, length, io.getByteOrder());
    }

    public static void write(RandomAccessOutput io, char[] data) throws IOException {
        write(io, data, 0, data.length, io.getByteOrder());
    }

    public static void write(DataOutput io, char[] data, int byteOrder) throws IOException {
        write(io, data, 0, data.length, byteOrder);
    }

    public static void write(RandomAccessOutput io, char[] data, int offset, int length) throws IOException {
        write(io, data, offset, length, io.getByteOrder());
    }

    public static void write(RandomAccessOutput io, int[] data) throws IOException {
        write(io, data, 0, data.length, io.getByteOrder());
    }

    public static void write(DataOutput io, int[] data, int byteOrder) throws IOException {
        write(io, data, 0, data.length, byteOrder);
    }

    public static void write(RandomAccessOutput io, int[] data, int offset, int length) throws IOException {
        write(io, data, offset, length, io.getByteOrder());
    }

    public static void write(RandomAccessOutput io, float[] data) throws IOException {
        write(io, data, 0, data.length, io.getByteOrder());
    }

    public static void write(DataOutput io, float[] data, int byteOrder) throws IOException {
        write(io, data, 0, data.length, byteOrder);
    }

    public static void write(RandomAccessOutput io, float[] data, int offset, int length) throws IOException {
        write(io, data, offset, length, io.getByteOrder());
    }

    public static void write(RandomAccessOutput io, long[] data) throws IOException {
        write(io, data, 0, data.length, io.getByteOrder());
    }

    public static void write(DataOutput io, long[] data, int byteOrder) throws IOException {
        write(io, data, 0, data.length, byteOrder);
    }

    public static void write(RandomAccessOutput io, long[] data, int offset, int length) throws IOException {
        write(io, data, offset, length, io.getByteOrder());
    }

    public static void write(RandomAccessOutput io, double[] data) throws IOException {
        write(io, data, 0, data.length, io.getByteOrder());
    }

    public static void write(DataOutput io, double[] data, int byteOrder) throws IOException {
        write(io, data, 0, data.length, byteOrder);
    }

    public static void write(RandomAccessOutput io, double[] data, int offset, int length) throws IOException {
        write(io, data, offset, length, io.getByteOrder());
    }

    public static void write(DataOutput io, short[] sh, int offset, int length, int byteOrder) throws IOException {
        byte[] b = new byte[length << 1];
        if(byteOrder == Endian.BIG_ENDIAN) {
            XtoByteBE.shortToByteBE(sh, offset, length, b, 0);
        }
        else {
            XtoByteLE.shortToByteLE(sh, offset, length, b, 0);
        }
        io.write(b);
    }

    public static void write(DataOutput io, char[] sh, int offset, int length, int byteOrder) throws IOException {
        byte[] b = transform(sh, offset, length, byteOrder);
        io.write(b);
    }

    protected static byte[] transform(char[] sh, int offset, int length, int byteOrder) {
        byte[] b = new byte[length << 1];
        if(byteOrder == Endian.BIG_ENDIAN) {
            XtoByteBE.charToByte(sh, offset, length, b, 0);
        }
        else {
            XtoByteLE.charToByte(sh, offset, length, b, 0);
        }
        return b;
    }

    public static void write(DataOutput io, int[] source, int offset, int length, int byteOrder) throws IOException {
        byte[] b = transform(source, offset, length, byteOrder);
        io.write(b);
    }

    protected static byte[] transform(int[] source, int offset, int length, int byteOrder) {
        byte[] b = new byte[length << 2];
        if(byteOrder == Endian.BIG_ENDIAN) {
            XtoByteBE.intToByte(source, offset, length, b, 0);
        }
        else {
            XtoByteLE.intToByte(source, offset, length, b, 0);
        }
        return b;
    }

    public static void write(DataOutput io, float[] source, int offset, int length, int byteOrder) throws IOException {
        byte[] b = transform(source, offset, length, byteOrder);
        io.write(b);
    }

    protected static byte[] transform(float[] source, int offset, int length, int byteOrder) {
        byte[] b = new byte[length << 2];
        if(byteOrder == Endian.BIG_ENDIAN) {
            XtoByteBE.floatToByteBE(source, offset, length, b, 0);
        }
        else {
            XtoByteLE.floatToByteLE(source, offset, length, b, 0);
        }
        return b;
    }

    public static void write(DataOutput io, long[] source, int offset, int length, int byteOrder) throws IOException {
        byte[] b = transform(source, offset, length, byteOrder);
        io.write(b);
    }

    protected static byte[] transform(long[] source, int offset, int length, int byteOrder) {
        byte[] b = new byte[length << 3];
        if(byteOrder == Endian.BIG_ENDIAN) {
            XtoByteBE.longToByteBE(source, offset, length, b, 0);
        }
        else {
            XtoByteLE.longToByteLE(source, offset, length, b, 0);
        }
        return b;
    }

    public static void write(DataOutput io, double[] source, int offset, int length, int byteOrder) throws IOException {
        byte[] b = transform(source, offset, length, byteOrder);
        io.write(b);
    }

    protected static byte[] transform(double[] source, int offset, int length, int byteOrder) {
        byte[] b = new byte[length << 3];
        if(byteOrder == Endian.BIG_ENDIAN) {
            XtoByteBE.doubleToByteBE(source, offset, length, b, 0);
        }
        else {
            XtoByteLE.doubleToByteLE(source, offset, length, b, 0);
        }
        return b;
    }
}
