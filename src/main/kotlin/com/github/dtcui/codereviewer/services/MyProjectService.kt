package com.github.dtcui.codereviewer.services

import com.intellij.openapi.project.Project
import com.github.dtcui.codereviewer.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
