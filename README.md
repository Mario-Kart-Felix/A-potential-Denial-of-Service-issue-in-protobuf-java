# A-potential-Denial-of-Service-issue-in-protobuf-java
A potential Denial of Service issue in protobuf-java high severity GitHub Reviewed Published 5 days ago in protocolbuffers/protobuf • Updated yesterday Vulnerability details Dependabot alerts 2 Package  com.google.protobuf:protobuf-java (maven) Affected versions &lt; 3.16.1 >= 3.18.0, &lt; 3.18.2 >= 3.19.0, &lt; 3.19.2 Patched versions 3.16.1 3.18.2 3.19.2 Package  com.google.protobuf:protobuf-kotlin (maven) Affected versions >= 3.18.0, &lt; 3.18.2 >= 3.19.0, &lt; 3.19.2 Patched versions 3.18.2 3.19.2 Package  google-protobuf (RubyGems) Affected versions &lt; 3.19.2 Patched versions 3.19.2 Description Summary A potential Denial of Service issue in protobuf-java was discovered in the parsing procedure for binary data.  Reporter: OSS-Fuzz  Affected versions: All versions of Java Protobufs (including Kotlin and JRuby) prior to the versions listed below. Protobuf "javalite" users (typically Android) are not affected.  Severity CVE-2021-22569 High - CVSS Score: 7.5, An implementation weakness in how unknown fields are parsed in Java. A small (~800 KB) malicious payload can occupy the parser for several minutes by creating large numbers of short-lived objects that cause frequent, repeated GC pauses.  Proof of Concept For reproduction details, please refer to the oss-fuzz issue that identifies the specific inputs that exercise this parsing weakness.  Remediation and Mitigation Please update to the latest available versions of the following packages:  protobuf-java (3.16.1, 3.18.2, 3.19.2) protobuf-kotlin (3.18.2, 3.19.2) google-protobuf [JRuby gem only] (3.19.2) References GHSA-wrvw-hg22-4m67 https://nvd.nist.gov/vuln/detail/CVE-2021-22569 https://bugs.chromium.org/p/oss-fuzz/issues/detail?id=39330 https://cloud.google.com/support/bulletins#gcp-2022-001