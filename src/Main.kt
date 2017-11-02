fun main(args: Array<String>) {
    val tempReader = TempReader()

    println(tempReader.readTemp("0000 0111", "1101 0000")) //125
    println(tempReader.readTemp("0000 0101", "0101 0000")) //85
    println(tempReader.readTemp("0000 0001", "1001 0001")) //25.0628
    println(tempReader.readTemp("0000 0000", "1010 0010")) //10.125
    println(tempReader.readTemp("0000 0000", "0000 1000")) //0.5
    println(tempReader.readTemp("0000 0000", "0000 0000")) //0
    println(tempReader.readTemp("1111 1111", "1111 1000")) //-0.5
    println(tempReader.readTemp("1111 1111", "0101 1110")) //-10.125
    println(tempReader.readTemp("1111 1110", "0110 1111")) //-25.0625
    println(tempReader.readTemp("1111 1100", "1001 0000")) //-55
}







