package net.thiki.rest.sample.biz.issue

import org.springframework.stereotype.Service

@Service
class IssueService(private val IssueRepo: IssueRepo){

    fun findAll(): List<Issue> {
        return IssueRepo.findAllIssue()
    }

    fun searchByReporter(reporterKey: String): List<Issue> {
        return IssueRepo.searchByReporter(reporterKey)

    }

}