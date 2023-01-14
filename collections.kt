
fun <T> `_`(vararg items: T) = items as kotlin.Array<T>
fun <T> Array(vararg items: T) = items as kotlin.Array<T>
fun <T> List(vararg items: T) = items.toList()
fun <T> MutableList(vararg items: T) = items.toMutableList()
fun <K, V> Map(vararg items: Pair<K, V>) = items.toMap()
fun <K, V> MutableMap(vararg items: Pair<K, V>) = items.toMap().toMutableMap()
fun <T> Set(vararg items: T) = items.toSet()
fun <T> MutableSet(vararg items: T) = items.toMutableSet()

object Array {
    operator fun <T> get(vararg items: T) = items as kotlin.Array<T>
    fun <T> of(vararg items: T) = items as kotlin.Array<T>
}

object List {
    operator fun <T> get(vararg items: T) = items.toList()
    fun <T> of(vararg items: T) = items.toList()
    fun <T> ofMutable(vararg items: T) = items.toMutableList()
}

object MutableList {
    operator fun <T> get(vararg items: T) = items.toMutableList()
    fun <T> of(vararg items: T) = items.toMutableList()
}

object Map {
    operator fun <K, V> get(vararg items: Pair<K, V>) = items.toMap()
    fun <K, V> of(vararg items: Pair<K, V>) = items.toMap()
    fun <K, V> ofMutable(vararg items: Pair<K, V>) = items.toMap().toMutableMap()
}

object MutableMap {
    operator fun <K, V> get(vararg items: Pair<K, V>) = items.toMap().toMutableMap()
    fun <K, V> of(vararg items: Pair<K, V>) = items.toMap().toMutableMap()
}

object Set {
    operator fun <T> get(vararg items: T) = items.toSet()
    fun <T> of(vararg items: T) = items.toSet()
    fun <T> ofMutable(vararg items: T) = items.toMutableSet()
}

object MutableSet {
    operator fun <T> get(vararg items: T) = items.toMutableSet()
    fun <T> of(vararg items: T) = items.toMutableSet()
}

typealias ARRAY = Array
typealias A = Array
typealias LIST = List
typealias L = List
typealias MUTABLELIST = MutableList
typealias ML = MutableList
typealias MAP = Map
typealias M = Map
typealias MUTABLEMAP = MutableMap
typealias MM = MutableMap
typealias SET = Set
typealias S = Set
typealias MUTABLESET = MutableSet
typealias MS = MutableSet
typealias `_` = List

fun main() {
    // array
    val a0 = arrayOf(1, 2, 3, 4)
    a0[3] = 0
    println(a0.contentToString()) // [1, 2, 3, 0]

    val a1 = Array.of(1, 2, 3, 4)
    a1[3] = 0
    println(a1.contentToString()) // [1, 2, 3, 0]

    val a2 = ARRAY[1, 2, 3, 4]
    a2[3] = 0
    println(a2.contentToString()) // [1, 2, 3, 0]

    val a3 = A[1, 2, 3, 4]
    a3[3] = 0
    println(a3.contentToString()) // [1, 2, 3, 0]

    val a4 = `_`(1, 2, 3, 4)
    a4[3] = 0
    println(a4.contentToString()) // [1, 2, 3, 0]


    // list
    val l0 = listOf(1, 2, 3, 4, listOf(5, 6, 7, 8))
    println(l0) // [1, 2, 3, 4, [5, 6, 7, 8]]

    val l1 = List.of(1, 2, 3, 4, List.of(5, 6, 7, 8))
    println(l1) // [1, 2, 3, 4, [5, 6, 7, 8]]

    val l2 = LIST[1, 2, 3, 4, LIST[5, 6, 7, 8]]
    println(l2) // [1, 2, 3, 4, [5, 6, 7, 8]]

    val l3 = L[1, 2, 3, 4, L[5, 6, 7, 8]]
    println(l3) // [1, 2, 3, 4, [5, 6, 7, 8]]

    val l4 = _[1, 2, 3, 4, _[5, 6, 7, 8]]
    println(l4) // [1, 2, 3, 4, [5, 6, 7, 8]]

    
    // mutable list
    val ml0 = mutableListOf(1, 2, 3, 4)
    ml0.add(5)
    println(ml0) // [1, 2, 3, 4, 5]
    
    val ml1 = MutableList.of(1, 2, 3, 4)
    ml1.add(5)
    println(ml1) // [1, 2, 3, 4, 5]
    
    val ml2 = MUTABLELIST[1, 2, 3, 4]
    ml2.add(5)
    println(ml2) // [1, 2, 3, 4, 5]
    
    val ml3 = ML[1, 2, 3, 4]
    ml3.add(5)
    println(ml3) // [1, 2, 3, 4, 5]
    
    val ml4 = List.ofMutable(1, 2, 3, 4)
    ml4.add(5)
    println(ml4) // [1, 2, 3, 4, 5]
    

    // map
    val m0 = mapOf("one" to 1, "two" to 2, "more" to mapOf("three" to 3, "four" to 4))
    println(m0) // {one=1, two=2, more={three=3, four=4}}

    val m1 = Map.of("one" to 1, "two" to 2, "more" to Map.of("three" to 3, "four" to 4))
    println(m1) // {one=1, two=2, more={three=3, four=4}}

    val m2 = MAP["one" to 1, "two" to 2, "more" to MAP["three" to 3, "four" to 4]]
    println(m2) // {one=1, two=2, more={three=3, four=4}}

    val m3 = M["one" to 1, "two" to 2, "more" to M["three" to 3, "four" to 4]]
    println(m3) // {one=1, two=2, more={three=3, four=4}}
    
    
    // mutable map
    val mm0 = mutableMapOf("one" to 1, "two" to 2)
    mm0.put("three", 3)
    println(mm0) // {one=1, two=2, three=3}
    
    val mm1 = MutableMap.of("one" to 1, "two" to 2)
    mm1.put("three", 3)
    println(mm1) // {one=1, two=2, three=3}
    
    val mm2 = MUTABLEMAP["one" to 1, "two" to 2]
    mm2.put("three", 3)
    println(mm2) // {one=1, two=2, three=3}
    
    val mm3 = MM["one" to 1, "two" to 2]
    mm3.put("three", 3)
    println(mm3) // {one=1, two=2, three=3}
    
    val mm4 = Map.ofMutable("one" to 1, "two" to 2)
    mm4.put("three", 3)
    println(mm4) // {one=1, two=2, three=3}


    // set
    val s0 = setOf(1, 2, 1, 3)
    println(s0) // [1, 2, 3]

    val s1 = Set.of(1, 2, 1, 3)
    println(s1) // [1, 2, 3]

    val s2 = SET[1, 2, 1, 3]
    println(s2) // [1, 2, 3]

    val s3 = S[1, 2, 1, 3]
    println(s3) // [1, 2, 3]


    // mutable set
    val ms0 = mutableSetOf(1, 2, 1, 3)
    ms0.add(4)
    println(ms0) // [1, 2, 3, 4]

    val ms1 = MutableSet.of(1, 2, 1, 3)
    ms1.add(4)
    println(ms1) // [1, 2, 3, 4]

    val ms2 = MUTABLESET[1, 2, 1, 3]
    ms2.add(4)
    println(ms2) // [1, 2, 3, 4]

    val ms3 = MS[1, 2, 1, 3]
    ms3.add(4)
    println(ms3) // [1, 2, 3, 4]

    val ms4 = Set.ofMutable(1, 2, 1, 3)
    ms4.add(4)
    println(ms4) // [1, 2, 3, 4]

}


