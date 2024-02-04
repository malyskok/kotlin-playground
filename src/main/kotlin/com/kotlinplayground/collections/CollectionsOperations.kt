package org.example.com.kotlinplayground.collections

import org.example.com.kotlinplayground.dataset.Course
import org.example.com.kotlinplayground.dataset.CourseCategory
import org.example.com.kotlinplayground.dataset.courseList

fun main() {
    val devpredicate = { c: Course -> c.category == CourseCategory.DEVELOPEMENT }
    val despredicate = { c: Course -> c.category == CourseCategory.DESIGN }
    val list = courseList()
    println(list.size)
//    val devCourses = list.filter { it.category == CourseCategory.DEVELOPEMENT }
//    val devCourses = list.filter { devpredicate.invoke(it) }
    val devCourses = filterCourses(list, devpredicate)
    println(devCourses.size)

    exploreMap(list, despredicate)
    exploreFlatMap(list)

    var nullList: MutableList<String>? = null
    nullList = mutableListOf()
    nullList?.add("Kamil") //Unnecessary safe call on a non-null receiver of type MutableList<String>?
    println(nullList)
    nullList?.forEach{ println(it) } //Unnecessary safe call on a non-null receiver of type MutableList<String>?

    var nullList2: MutableList<String?> = mutableListOf(null)
    nullList2.forEach{ println(it?.length) }
}

fun filterCourses(list: MutableList<Course>, predicate: (Course) -> Boolean): List<Course> {
//    return list.filter { predicate.invoke(it) }
    return list.filter(predicate)
}

fun exploreMap(list: MutableList<Course>, despredicate: (Course) -> Boolean) {
    list
        .filter(despredicate)
        .map { it.name }
        .forEach { println(it) }
}

fun exploreFlatMap(list: MutableList<Course>) {
    val kafkas = list.flatMap { course ->
        course.topicsCovered
            .filter { it == "Kafka" }
            .map { course.name }
    }
    println(kafkas)
}