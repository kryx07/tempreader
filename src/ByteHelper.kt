object ByteHelper{
    fun getByte(string: String): Byte = Integer.parseInt(string.replace(" ", ""), 2).toByte()

    fun getByteValue(byte: Byte): Double {
        return if (byte < 0) {
            reverseByte(byte).toDouble()
        } else {
            byte.toDouble()
        }
    }

    fun reverseByte(byte: Byte): Int = byte + Byte.MAX_VALUE - Byte.MIN_VALUE + 1

}