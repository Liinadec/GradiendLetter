package com.example.gradiendletter

fun String.gradientLine(): MutableList<String> {

    var finalList = mutableListOf<String>()
    var charController = 0

    for (l in this) {
        when (this[charController]) {
            ' ' ->
                when (charController) {
                    0 -> for (i in 'A'..'Z') {
                        finalList.add(i.toString())
                        finalList.add(' '.toString())
                        charController++
                        break
                    }
                    else -> for (i in 'A'..'Z') {
                        finalList.add(this.substring(0 until charController) + ' '.toString())
                        charController++
                        break
                    }
                }
            in 'A'..'Z' ->
                when (charController) {
                    0 -> for (i in 'A'..'Z') {
                        if (i != this[charController]) {
                            finalList.add(i.toString())
                        } else {
                            finalList.add(i.toString())
                            charController++
                            break
                        }
                    }
                    else -> for (i in 'A'..'Z') {
                        if (i != this[charController]) {
                            finalList.add(this.substring(0 until charController) + i.toString())
                        } else {
                            finalList.add(this.substring(0 until charController) + i.toString())
                            charController++
                            break
                        }
                    }

                }
            in 'a'..'z' ->
                when (charController) {
                    0 -> for (i in 'a'..'z') {
                        if (i != this[charController]) {
                            finalList.add(i.toString())
                        } else {
                            finalList.add(i.toString())
                            charController++
                            break
                        }
                    }
                    else -> for (i in 'a'..'z') {

                        if (i != this[charController]) {
                            finalList.add(this.substring(0 until charController) + i.toString())
                        } else {
                            finalList.add(this.substring(0 until charController) + i.toString())
                            charController++
                            break
                        }
                    }
                }
        }
    }
    return finalList
}