fun <T> List(vararg items: T): kotlin.collections.List<T> = items.toList()
fun <T> LIST(vararg items: T): kotlin.collections.List<T> = items.toList()
fun <T> L(vararg items: T): kotlin.collections.List<T> = items.toList()

class List<T> {
    companion object {
		operator fun <T> get(vararg items: T): kotlin.collections.List<T> = items.toList()
		fun <T> of(vararg items: T): kotlin.collections.List<T> = items.toList()
    }
}

typealias LIST<T> = List<T>
typealias L<T> = List<T>
typealias _L<T> = List<T>
typealias `@`<T> = List<T>
typealias `$`<T> = List<T>
typealias `_`<T> = List<T>
typealias `[]`<T> = List<T>

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
    
    val w = `@`[1, 2, 3, `@`[4, 5, 6]]
    println(w) // [1, 2, 3, [4, 5, 6]]
    
    val x = `$`[1, 2, 3, `$`[4, 5, 6]]
    println(x) // [1, 2, 3, [4, 5, 6]]
    
    val y = `_`[1, 2, 3, `_`[4, 5, 6]]
    println(y) // [1, 2, 3, [4, 5, 6]]
    
    val z = `[]`[1, 2, 3, `[]`[4, 5, 6]]
    println(z) // [1, 2, 3, [4, 5, 6]]
}
