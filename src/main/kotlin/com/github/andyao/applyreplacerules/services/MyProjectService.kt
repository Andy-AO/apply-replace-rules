package com.github.andyao.applyreplacerules.services

import com.intellij.openapi.project.Project
import com.github.andyao.applyreplacerules.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
