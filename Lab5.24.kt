fun transposeMatrix(matrix: Array<Array<Int>>): Array<Array<Int>> {
    val rows = matrix.size
    val columns = matrix[0].size
    val transposedMatrix = Array(columns) { Array(rows) { 0 } }

    for (i in 0 until rows) {
        for (j in 0 until columns) {
            transposedMatrix[j][i] = matrix[i][j]
        }
    }

    return transposedMatrix
}

fun main() {
    val originalMatrix = arrayOf(
        arrayOf(1, 2, 3),
        arrayOf(4, 5, 6),
        arrayOf(7, 8, 9)
    )

    val transposedMatrix = transposeMatrix(originalMatrix)

    println("Original Matrix:")
    for (row in originalMatrix) {
        println(row.contentToString())
    }

    println("Transposed Matrix:")
    for (row in transposedMatrix) {
        println(row.contentToString())
    }
}