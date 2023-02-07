package com.example.factorial

open class State

class Error : State()

class Progress : State()

class Result(val factorial: String) : State()