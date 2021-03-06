/*
 * The Alluxio Open Foundation licenses this work under the Apache License, version 2.0
 * (the "License"). You may not use this work except in compliance with the License, which is
 * available at www.apache.org/licenses/LICENSE-2.0
 *
 * This software is distributed on an "AS IS" basis, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied, as more fully set forth in the License.
 *
 * See the NOTICE file distributed with this work for information regarding copyright ownership.
 */

package alluxio.uri;

import com.google.common.base.Objects;

/**
 * A single master authority implementation.
 */
public class SingleMasterAuthority implements Authority {
  private static final long serialVersionUID = -8901940466477691715L;
  private final String mAuthority;
  private final String mHost;
  private final int mPort;

  /**
   * @param authority the authority string of the URI
   * @param host the host of this authority
   * @param port the port of this authority
   */
  public SingleMasterAuthority(String authority, String host, int port) {
    mAuthority = authority;
    mHost = host;
    mPort = port;
  }

  /**
   * @return the host of this authority
   */
  public String getHost() {
    return mHost;
  }

  /**
   * @return the port of this authority
   */
  public int getPort() {
    return mPort;
  }

  @Override
  public int compareTo(Authority other) {
    return toString().compareTo(other.toString());
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof SingleMasterAuthority)) {
      return false;
    }
    SingleMasterAuthority that = (SingleMasterAuthority) o;
    return toString().equals(that.toString());
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(mAuthority);
  }

  @Override
  public String toString() {
    return mAuthority;
  }
}
