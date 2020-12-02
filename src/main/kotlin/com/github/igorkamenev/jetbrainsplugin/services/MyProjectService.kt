package com.github.igorkamenev.jetbrainsplugin.services

import com.intellij.openapi.project.Project
import com.github.igorkamenev.jetbrainsplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
