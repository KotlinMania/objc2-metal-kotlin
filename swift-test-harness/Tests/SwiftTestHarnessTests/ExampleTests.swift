#if canImport(Testing)
import Testing
import Objc2Metal

@Suite("Objc2Metal Swift Export Tests")
struct Objc2MetalExportTests {
    @Test("Objc2Metal swift module imported cleanly")
    func testSwiftModuleLoads() throws {
        #expect(Bool(true), "Objc2Metal swift module imported cleanly")
    }
}
#elseif canImport(XCTest)
import XCTest
import Objc2Metal

final class Objc2MetalExportTests: XCTestCase {
    func testSwiftModuleLoads() throws {
        XCTAssertTrue(true, "Objc2Metal swift module imported cleanly")
    }
}
#endif
