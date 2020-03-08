tasks.register("webpack", Exec::class.java) {
    group = "Web App"

    inputs.file("package-lock.json").withPathSensitivity(PathSensitivity.RELATIVE)
    inputs.dir("src/main").withPathSensitivity(PathSensitivity.RELATIVE)
    outputs.dir("dist")
    outputs.cacheIf { true }

    commandLine("node_modules/.bin/webpack")
}