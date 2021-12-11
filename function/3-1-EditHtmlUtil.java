if (includeSuiteSetup) {
    WikiPage suiteTeardown =
    PageCrawlerImpl.getInheritedPage(
    SuiteResponder.SUITE_TEARDOWN_NAME,
    wikiPage
    );
    if (suiteTeardown != null) {
    WikiPagePath pagePath =
    suiteTeardown.getPageCrawler().getFullPath (suiteTeardown); 
    String pagePathName = PathParser.render(pagePath);
    buffer.append("!include -teardown .")
                .append(pagePathName)
                .append("\n");
    }
    }
    }
    pageData.setContent(buffer.toString()); return pageData.getHtml(
    