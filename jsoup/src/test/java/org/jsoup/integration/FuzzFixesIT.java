package org.jsoup.integration;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.File;
import java.io.IOException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 Tests fixes for issues raised by the <a href="https://oss-fuzz.com/testcases?project=jsoup">OSS Fuzz project</a>. As
 some of these are timeout tests - run each file 100 times and ensure under time.
 */
public class FuzzFixesIT {
    static int numIters = 50;
    static int timeout = 30; // external fuzzer is set to 60 for 100 runs
    static File testDir = ParseTest.getFile("/fuzztests/");

    private static Stream<File> testFiles() {
        File[] files = testDir.listFiles();
        assertNotNull(files);
        assertTrue(files.length > 10);

        return Stream.of(files);
    }


}