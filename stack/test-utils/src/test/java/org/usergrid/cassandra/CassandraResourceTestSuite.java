package org.usergrid.cassandra;


import org.junit.ClassRule;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


/**
 * An example TestSuite to demonstrate how to use the new
 * CassandraResource fixture.
 */
@RunWith( Suite.class )
@Suite.SuiteClasses( {
        CassandraResourceTest.class,
} )
public class CassandraResourceTestSuite
{
    @ClassRule
    public static CassandraResource cassandraResource = new CassandraResource();
}
