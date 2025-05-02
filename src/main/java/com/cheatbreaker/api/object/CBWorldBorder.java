/*
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
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.cheatbreaker.api.object;

import com.cheatbreaker.api.CheatBreakerAPI;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.bukkit.Location;

@EqualsAndHashCode
@AllArgsConstructor
public final class CBWorldBorder {

    @Getter private final String id;
    @Getter private final String world;
    @Getter private final boolean cancelsExit;
    @Getter private final boolean canShrinkExpand;
    @Getter private final int color;
    @Getter private final double min_x;
    @Getter private final double min_z;
    @Getter private final double max_x;
    @Getter private final double max_z;

    public CBWorldBorder(String id, Location locationmin, Location locationmax, int color, boolean cancelsExit, boolean canShrinkExpand) {
        this(
            id,
            CheatBreakerAPI.getInstance().getWorldIdentifier(locationmin.getWorld()),
            cancelsExit,
            canShrinkExpand,
            color,
            locationmin.getBlockX(),
            locationmin.getBlockZ(),
            locationmax.getBlockX(),
            locationmax.getBlockZ()
        );
    }

}