def manage(){

    println("is this thing on")
    def job = """job('demo') {
    steps {
        shell('echo Hello World!')
    }
}"""
    jobDsl scriptText: job
}

return this
