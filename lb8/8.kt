fun main() {
    println("Расчет количества кадров")

    val min = 1
    val fps = 30
    val frames = calculateFrames(min, fps)
    println("За $min минуту при $fps FPS будет показано $frames кадров")
}

fun calculateFrames(min: Int, fps: Int): Long {
    val seconds = min * 60
    return seconds * fps.toLong()
}
