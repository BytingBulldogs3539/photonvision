/*
 * Copyright (C) Photon Vision.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

// THIS FILE WAS AUTO-GENERATED BY ./photon-serde/generate_messages.py. DO NOT MODIFY

package org.photonvision.struct;

import org.photonvision.common.dataflow.structures.Packet;
import org.photonvision.common.dataflow.structures.PacketSerde;
import org.photonvision.utils.PacketUtils;

// Assume that the base class lives here and we can import it
import org.photonvision.targeting.*;


/**
 * Auto-generated serialization/deserialization helper for PnpResult
 */
public class PnpResultSerde implements PacketSerde<PnpResult> {
    // Message definition md5sum. See photon_packet.adoc for details
    public static final String MESSAGE_VERSION = "0d1f2546b00f24718e30f38d206d4491";
    public static final String MESSAGE_FORMAT = "Transform3d best;Transform3d alt;float64 bestReprojErr;float64 altReprojErr;float64 ambiguity;";

    public final String getTypeString() { return MESSAGE_FORMAT; }
    public final String getInterfaceUUID() { return MESSAGE_VERSION; }

    @Override
    public int getMaxByteSize() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getMaxByteSize'");
    }

    @Override
    public void pack(Packet packet, PnpResult value) {
        // field is shimmed!
        PacketUtils.packTransform3d(packet, value.best);

        // field is shimmed!
        PacketUtils.packTransform3d(packet, value.alt);

        // field bestReprojErr is of intrinsic type float64
        packet.encode((double) value.bestReprojErr);

        // field altReprojErr is of intrinsic type float64
        packet.encode((double) value.altReprojErr);

        // field ambiguity is of intrinsic type float64
        packet.encode((double) value.ambiguity);
    }

    @Override
    public PnpResult unpack(Packet packet) {
        var ret = new PnpResult();

        // field is shimmed!
        ret.best = PacketUtils.unpackTransform3d(packet);

        // field is shimmed!
        ret.alt = PacketUtils.unpackTransform3d(packet);

        // bestReprojErr is of intrinsic type float64
        ret.bestReprojErr = packet.decodeDouble();

        // altReprojErr is of intrinsic type float64
        ret.altReprojErr = packet.decodeDouble();

        // ambiguity is of intrinsic type float64
        ret.ambiguity = packet.decodeDouble();

        return ret;
    }
}
