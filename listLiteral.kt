fun <T> List(vararg items: T) = items.toList()
fun <T> LIST(vararg items: T) = items.toList()
fun <T> L(vararg items: T) = items.toList()

object List {
    operator fun <T> get(vararg items: T) = items.toList()
    fun <T> of(vararg items: T) = items.toList()
}

typealias LIST = List
typealias L = List
typealias _L = List
typealias `_` = List
typealias `@` = List
typealias `$` = List
typealias `[]` = List
typealias リスト = List
typealias 串列 = List

fun main() {
    val a = listOf(1, 2, 3, listOf(4, 5, 6))
    println(a) // [1, 2, 3, [4, 5, 6]]
    
    val b = List(1, 2, 3, List(4, 5, 6))
    println(b) // [1, 2, 3, [4, 5, 6]]
    
    val c = LIST(1, 2, 3, LIST(4, 5, 6))
    println(c) // [1, 2, 3, [4, 5, 6]]
    
    val d = L(1, 2, 3, L(4, 5, 6))
    println(d) // [1, 2, 3, [4, 5, 6]]
    
    var e = List.of(1, 2, 3, List.of(4, 5, 6))
    println(e) // [1, 2, 3, [4, 5, 6]]
    
    val f = List[1, 2, 3, List[4, 5, 6]]
    println(f) // [1, 2, 3, [4, 5, 6]]
    
    val g = LIST[1, 2, 3, LIST[4, 5, 6]]
    println(g) // [1, 2, 3, [4, 5, 6]]
    
    val h = L[1, 2, 3, L[4, 5, 6]]
    println(h) // [1, 2, 3, [4, 5, 6]]
    
    val i = _L[1, 2, 3, _L[4, 5, 6]]
    println(i) // [1, 2, 3, [4, 5, 6]]
    
    val v = _[1, 2, 3, _[4, 5, 6]]
    println(v) // [1, 2, 3, [4, 5, 6]]
    
    val w = `@`[1, 2, 3, `@`[4, 5, 6]]
    println(w) // [1, 2, 3, [4, 5, 6]]
    
    val x = `$`[1, 2, 3, `$`[4, 5, 6]]
    println(x) // [1, 2, 3, [4, 5, 6]]
    
    val y = `[]`[1, 2, 3, `[]`[4, 5, 6]]
    println(y) // [1, 2, 3, [4, 5, 6]]
    
    val z = リスト[1, 2, 3, リスト[4, 5, 6]]
    println(z) // [1, 2, 3, [4, 5, 6]]
    
    val u = 串列[1, 2, 3, 串列[4, 5, 6]]
    println(u) // [1, 2, 3, [4, 5, 6]]
}
