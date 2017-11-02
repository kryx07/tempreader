class TempReader {

    fun readTemp(lsb: String, msb: String) = readTemp(ByteHelper.getByte(lsb), ByteHelper.getByte(msb))

    fun readTemp(msb: Byte, lsb: Byte): Double {

        var msbVal = ByteHelper.getByteValue(msb)
        var lsbVal = ByteHelper.getByteValue(lsb)
        var factor = 1

        if (msbVal >= 248) {
            msbVal = 255 - msbVal
            lsbVal = 256 - lsbVal
            factor = -1
        }

        return factor * (msbVal * 16 + lsbVal / 16)
    }

}