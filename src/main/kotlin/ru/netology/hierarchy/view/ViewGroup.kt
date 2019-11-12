package ru.netology.hierarchy.view

/*
* Класс, наследующийся от View, содержит member function addView
* (внутри хранит пока всего одно View - как пройдём коллекции, сможет хранить список).
* */
class ViewGroup : View() {
    lateinit var viewGroup: View

    fun addView(view: View){
        viewGroup = view
    }
}