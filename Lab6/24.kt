fun transposeMatrix(matrix: Array<Array<Int>>): Array<Array<Int>> {
    val nRows = matrix.size
    val nCols = matrix[0].size

    val transposedMatrix = Array(nCols) { Array(nRows) { 0 } }

    for (i in 0 until nRows) {
        for (j in 0 until nCols) {
            transposedMatrix[j][i] = matrix[i][j]
        }
    }

    return transposedMatrix
}

fun main() {
    val originalMatrix = arrayOf(
        arrayOf(11, 12, 13),
        arrayOf(14, 15, 16),
        arrayOf(17, 18, 19)
    )

    val transposedMatrix = transposeMatrix(originalMatrix)
    println("Исходная матрица:")
    originalMatrix.forEach { println(it.contentToString()) }

    println("\nТранспонированная матрица:")
    transposedMatrix.forEach { println(it.contentToString()) }
}