/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.smartloli.kafka.eagle.common.protocol.topic;

import org.smartloli.kafka.eagle.common.protocol.BaseProtocol;

/**
 * Reassign Partition.
 * 
 * @author smartloli.
 *
 *         Created by May 21, 2020
 */
public class ReassignPartitionInfo extends BaseProtocol {

	// {"--zookeeper","127.0.0.1:2181","--reassignment-json-file",createKafkaTempJson(tuple._1).getAbsolutePath(),"--execute"}
	// {"--zookeeper","127.0.0.1:2181","--reassignment-json-file",createKafkaTempJson(tuple._2).getAbsolutePath(),"--verify"}
	private String[] command;
	private String type;// execute or verify

	public String[] getCommand() {
		return command;
	}

	public void setCommand(String[] command) {
		this.command = command;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
